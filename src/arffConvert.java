/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perfect
 */
public class arffConvert {
        public static void main(String[] args) {
        String[] arg = new String[4];
        arg[0] = "-dir";
        arg[1] = "C:\\Users\\perfect\\Desktop\\arfff";
        arg[2] = ">";
        arg[3] = "C:\\Users\\perfect\\Desktop\\arfff\\demomodel.arff";
        weka.core.converters.TextDirectoryLoader.main(arg);
        }
    
}
