package crudof;

/**
 * Kevin Gómez Valderas 2ºDAM
 */
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class SocioTableModel extends AbstractTableModel {

    private final String[] NOMBRECOLUMNAS = {"Name", "Age", "Monthly Fee", "Membership Type"};
    private final List<Socio> SOCIOS;

    public SocioTableModel() {
        SOCIOS = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return SOCIOS.size();
    }

    @Override
    public int getColumnCount() {
        return NOMBRECOLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Socio socio = SOCIOS.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> socio.getName();
            case 1 -> socio.getAge();
            case 2 -> socio.getMonthlyFee();
            case 3 -> socio.getMembershipType();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return NOMBRECOLUMNAS[column];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Socio socio = SOCIOS.get(rowIndex);
        switch (columnIndex) {
            case 0 ->
                socio.setName((String) aValue);
            case 1 ->
                socio.setAge((int) aValue);
            case 2 ->
                socio.setMonthlyFee((double) aValue);
            case 3 ->
                socio.setMembershipType((String) aValue);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void addSocio(Socio socio) {
        SOCIOS.add(socio);
        fireTableRowsInserted(SOCIOS.size() - 1, SOCIOS.size() - 1);
    }

    public void removeSocio(int rowIndex) {
        SOCIOS.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Socio getSocio(int rowIndex) {
        return SOCIOS.get(rowIndex);
    }

    public void updateSocio(int rowIndex, Socio socio) {
        SOCIOS.set(rowIndex, socio);
        fireTableRowsUpdated(rowIndex, rowIndex);
    }

    public List<Socio> filterByMembershipType(String membershipType) {
        List<Socio> filteredSocios = new ArrayList<>();
        for (Socio socio : SOCIOS) {
            if (socio.getMembershipType().equalsIgnoreCase(membershipType)) {
                filteredSocios.add(socio);
            }
        }
        return filteredSocios;
    }

    public void sortByName() {
        SOCIOS.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        fireTableDataChanged();
    }
}
