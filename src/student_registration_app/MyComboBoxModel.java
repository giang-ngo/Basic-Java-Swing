/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_registration_app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author LENOVO
 */
public class MyComboBoxModel implements ComboBoxModel<String> {

    private List<String> majors;
    private Object selectObject;

    public MyComboBoxModel() {
        majors = new ArrayList<>();
        majors.add("Công nghệ thông tin");
        majors.add("Điện tử viễn thông");
        majors.add("Ngôn ngữ anh");
        majors.add("Khoa học máy tính");
        majors.add("Quản trị kinh doanh");
        majors.add("Logistic");
        majors.add("Tài chính ngân hàng");

    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectObject = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectObject;
    }

    @Override
    public int getSize() {
        return majors.size();
    }

    @Override
    public String getElementAt(int index) {
        return majors.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

}
