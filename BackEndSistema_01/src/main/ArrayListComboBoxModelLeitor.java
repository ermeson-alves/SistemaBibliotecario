/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Guilherme
 */
public class ArrayListComboBoxModelLeitor extends AbstractListModel implements ComboBoxModel{
  private Object selectedItem;

  private ArrayList anArrayList;
  
  ConjuntoLeitores leitores = ConjuntoLeitores.getInstance();
  
  public ArrayListComboBoxModelLeitor(ArrayList arrayList) {
        this.anArrayList = leitores.getLeitores();
  }

  public Object getSelectedItem() {
    return selectedItem;
  }

  public void setSelectedItem(Object newValue) {
    selectedItem = newValue;
  }

  public int getSize() {
    return anArrayList.size();
  }

  public Object getElementAt(int i) {
    return anArrayList.get(i);
  }
}
