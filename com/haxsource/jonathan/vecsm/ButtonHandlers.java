package com.haxsource.jonathan.vecsm;

import com.gamsion.chris.vecsm.gui.CreationGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jonathanwong on 12/3/16.
 */
public class ButtonHandlers {
    public static class create implements ActionListener{
        CreationGUI hope;
        public create(CreationGUI imdumb){
            hope = imdumb;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public static class addItem implements ActionListener{
        CreationGUI hope;
        public addItem(CreationGUI imdumb){
            hope = imdumb;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
