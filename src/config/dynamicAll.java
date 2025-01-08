package config;
import de.wannawork.jcalendar.JCalendarComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;

public class dynamicAll {
    private Map<String, Object> fieldMap;
    
    public dynamicAll() {
        fieldMap = new LinkedHashMap<>(); // LinkedHashMap untuk menjaga urutan field
    }
    
    // Method overloading untuk menambahkan berbagai jenis komponen
    public void addField(String fieldName, JTextField component) {
        fieldMap.put(fieldName, component);
    }
        
    public void addField(String fieldName, JSpinner component) {
        fieldMap.put(fieldName, component);
    }
    
    public void addField(String fieldName, JCalendarComboBox component) {
        fieldMap.put(fieldName, component);
    }
    
    // Menambahkan method untuk JComboBox
    public void addField(String fieldName, JComboBox<?> component) {
        fieldMap.put(fieldName, component);
    }
    
    // Menambahkan method untuk JFormattedTextField
    public void addField(String fieldName, JFormattedTextField component) {
        fieldMap.put(fieldName, component);
    }
    
    // Mendapatkan array nama field
    public String[] getFieldNames() {
        return fieldMap.keySet().toArray(new String[0]);
    }
    
    // Mendapatkan array values dengan penanganan khusus untuk setiap jenis komponen
    public String[] getFieldValues() {
        return fieldMap.entrySet().stream()
            .map(entry -> {
                Object component = entry.getValue();
                if (component instanceof JFormattedTextField) {
                    Object value = ((JFormattedTextField) component).getValue();
                    // Handle nilai kosong
                    if (value == null) {
                        return "";
                    }
                    // Handle nilai date
                    if (value instanceof Date) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        return sdf.format((Date) value);
                    }
                    // Handle nilai number
                    if (value instanceof Number) {
                        return value.toString();
                    }
                    // Handle nilai string dan lainnya
                    return value.toString();
                } else if (component instanceof JTextField) {
                    return ((JTextField) component).getText();
                } else if (component instanceof JSpinner) {
                    return String.valueOf(((JSpinner) component).getValue());
                } else if (component instanceof JCalendarComboBox) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = ((JCalendarComboBox) component).getDate();
                    return sdf.format(date);
                } else if (component instanceof JComboBox) {
                    Object selectedItem = ((JComboBox<?>) component).getSelectedItem();
                    return selectedItem != null ? selectedItem.toString() : "";
                }
                return "";
            })
            .toArray(String[]::new);
    }
    
    // Mengecek apakah ada field yang kosong
    public boolean hasEmptyFields() {
        return fieldMap.entrySet().stream()
            .anyMatch(entry -> {
                Object component = entry.getValue();
                if (component instanceof JFormattedTextField) {
                    JFormattedTextField formatted = (JFormattedTextField) component;
                    Object value = formatted.getValue();
                    if (value == null) {
                        return true;
                    }
                    // Jika nilai adalah String, periksa apakah kosong
                    if (value instanceof String) {
                        return ((String) value).trim().isEmpty();
                    }
                    // Untuk tipe data lain, anggap tidak kosong jika ada nilainya
                    return false;
                } else if (component instanceof JTextField) {
                    return ((JTextField) component).getText().trim().isEmpty();
                } else if (component instanceof JSpinner) {
                    return ((JSpinner) component).getValue() == null;
                } else if (component instanceof JCalendarComboBox) {
                    return ((JCalendarComboBox) component).getDate() == null;
                } else if (component instanceof JComboBox) {
                    return ((JComboBox<?>) component).getSelectedItem() == null;
                }
                return true;
            });
    }
}