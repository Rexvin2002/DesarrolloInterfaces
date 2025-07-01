
package Unidad01.CRUDOF;

/**
 *
 * @author kgv17
 */
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class SocioTableModel extends AbstractTableModel {
    private String[] columnNames = { "Name", "Age", "Monthly Fee", "Membership Type" };
    private List<Socio> socios;

    public SocioTableModel() {
        socios = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return socios.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Socio socio = socios.get(rowIndex);
        switch (columnIndex) {
            case 0: return socio.getName();
            case 1: return socio.getAge();
            case 2: return socio.getMonthlyFee();
            case 3: return socio.getMembershipType();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Socio socio = socios.get(rowIndex);
        switch (columnIndex) {
            case 0: socio.setName((String) aValue); break;
            case 1: socio.setAge((int) aValue); break;
            case 2: socio.setMonthlyFee((double) aValue); break;
            case 3: socio.setMembershipType((String) aValue); break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void addSocio(Socio socio) {
        socios.add(socio);
        fireTableRowsInserted(socios.size() - 1, socios.size() - 1);
    }

    public void removeSocio(int rowIndex) {
        socios.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Socio getSocio(int rowIndex) {
        return socios.get(rowIndex);
    }

    public void updateSocio(int rowIndex, Socio socio) {
        socios.set(rowIndex, socio);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public List<Socio> filterByMembershipType(String membershipType) {
        List<Socio> filteredSocios = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.getMembershipType().equalsIgnoreCase(membershipType)) {
                filteredSocios.add(socio);
            }
        }
        return filteredSocios;
    }

    public void sortByName() {
        socios.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        fireTableDataChanged();
    }
}

