 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perfect
 */
public class TestSVM {

    public static void main(String[] args) {
        String[] argo = new String[4];
        argo[0] = "-l";
        argo[1] = "C:\\Users\\perfect\\Desktop\\weka-3-7-10\\friends.model";
        argo[2] = "-T";
        argo[3] = args[0];
        weka.classifiers.meta.FilteredClassifier.main(argo);
    }

}
