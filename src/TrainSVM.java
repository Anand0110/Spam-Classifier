
public class TrainSVM {
    public static void main(String[] args) {
               
         String[] argv = new String[21];           
                argv[0] = "-t";
                argv[1] = "C:\\Users\\perfect\\Desktop\\weka-3-7-10\\weka-3-7-10\\data\\finalwekatraining.arff";
                argv[2] = "-F";
                argv[3] = "weka.filters.unsupervised.attribute.StringToWordVector -R first-last -W 1000 -prune-rate -1.0 -N 0 -stemmer weka.core.stemmers.NullStemmer -M 1";
                argv[4] = "-W";
                argv[5] = "weka.classifiers.functions.SMO";
                argv[6] = "--";
                argv[7] = "-C";
                argv[8] = "1.0";
                argv[9] = "-L";
                argv[10] = "0.001";
                argv[11] = "-P";
                argv[12] = "1.0E-12";
                argv[13] = "-N";
                argv[14] = "0";
                argv[15] = "-V";
                argv[16] = "-1";
                argv[17] = "-W";
                argv[18] = "1";
                argv[19] = "-K";
                argv[20] = "weka.classifiers.functions.supportVector.PolyKernel -C 250007 -E 1.0";
         
                weka.classifiers.meta.FilteredClassifier.main(argv);
    }
}
