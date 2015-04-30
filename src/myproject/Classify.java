package myproject;


import java.io.*;
import java.util.*;

public class Classify {
    
    public static void main(String args[]) {
        
    File loc = new File("E:\\project\\classify");
       // getWordCount(loc);
        }

//    public static void getWordCount(File folder) {
//        int count = 0;
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        File[] listofFiles = folder.listFiles();
//        for (File f : listofFiles) {
//            if (f.isFile()) {
//                System.out.println(count + " " + f.getName());
//                count++;
//                try {
//                    Scanner s = new Scanner(f).useDelimiter("[^a-zA-Z]");
//                    while (s.hasNext()) {
//                        String word = s.next().toLowerCase();
//                        if (hm.containsKey(word)) {
//                            hm.put(word, hm.get(word) + 1);
//                        } else {
//                            hm.put(word, 1);
//                        }
//
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace(System.out);
//                }
//            }
//
//        }
//        
//        for (File f : listofFiles) {
//            
//            
//            if (f.isFile()) {
//
//                try {
//                    double spamd = 0;
//                    double nonspamd = 0;
//                    String line = "";
//                    HashMap<String, Double> sp = new HashMap<String, Double>();
//                    BufferedReader br = new BufferedReader(new FileReader("E:\\\\project\\\\myproject\\\\build\\\\classes\\\\myproject\\spamVector"));
//                   
//                    while ((line = br.readLine()) != null) {
//                        String parts[] = line.split(" ");
//                        double v = Double.parseDouble(parts[1]);
//                        sp.put(parts[0], v);
//                    }
//                    HashMap<String, Double> nsp = new HashMap<String, Double>();
//                    BufferedReader br1 = new BufferedReader(new FileReader("E:\\\\project\\\\myproject\\\\build\\\\classes\\\\myproject\\nonspamVector"));                    String line1 = "";
//                    while ((line1 = br1.readLine()) != null) {
//                        String parts[] = line1.split(" ");
//                        double v = Double.parseDouble(parts[1]);
//                        nsp.put(parts[0], v);
//                    }
//                    System.out.println("spam= " + sp.size() + "non spam=" + nsp.size());
//                    int c1 = 0, c2 = 0;
//                    for (Map.Entry<String, Integer> e : hm.entrySet()) {
//                        String word = e.getKey();
//                     if (sp.containsKey(word)) {
//                            c1++;
//                            spamd = spamd + (-1) * (sp.get(word));
//                        }
//
//                        if (nsp.containsKey(word)) {
//                            c2++;
//                            nonspamd = nonspamd + (-1) * (nsp.get(word));
//                        }
//
//                    }
//                    System.out.println("c1=" + c1 + "c2=" + c2);
//                    double totalspam = spamd + Math.log(0.5);
//                    double totalnonspam = nonspamd + Math.log(0.5);
//                    if (totalspam > totalnonspam) {
//                        System.out.println("Spam");
//                    } else {
//                        System.out.println("NonSpam");
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace(System.out);
//                }
//            }
//        }
//    }
//}









public static void getWordCount1(String str) {
        int count = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //File[] listofFiles = folder.listFiles();
        //for (File f : listofFiles) {
        File f = new File(str);    
        if (f.isFile()) {
                
                System.out.println(count + " " + f.getName());
                count++;
                try {
                    Scanner s = new Scanner(f).useDelimiter("[^a-zA-Z]");
                    while (s.hasNext()) {
                        String word = s.next().toLowerCase();
                        if (hm.containsKey(word)) {
                            hm.put(word, hm.get(word) + 1);
                        } else {
                            hm.put(word, 1);
                        }

                    }

                } catch (Exception e) {
                    e.printStackTrace(System.out);
                }
            }

        //}
        
      //  for (File f : listofFiles) {
            
            
            if (f.isFile()) {

                try {
                    double spamd = 0;
                    double nonspamd = 0;
                    String line = "";
                    HashMap<String, Double> sp = new HashMap<String, Double>();
                    BufferedReader br = new BufferedReader(new FileReader("E:\\\\project\\\\myproject\\\\build\\\\classes\\\\myproject\\spamVector"));
                   
                    while ((line = br.readLine()) != null) {
                        String parts[] = line.split(" ");
                        double v = Double.parseDouble(parts[1]);
                        sp.put(parts[0], v);
                    }
                    HashMap<String, Double> nsp = new HashMap<String, Double>();
                    BufferedReader br1 = new BufferedReader(new FileReader("E:\\\\project\\\\myproject\\\\build\\\\classes\\\\myproject\\nonspamVector"));                    String line1 = "";
                    while ((line1 = br1.readLine()) != null) {
                        String parts[] = line1.split(" ");
                        double v = Double.parseDouble(parts[1]);
                        nsp.put(parts[0], v);
                    }
                    System.out.println("spam= " + sp.size() + "non spam=" + nsp.size());
                    int c1 = 0, c2 = 0;
                    for (Map.Entry<String, Integer> e : hm.entrySet()) {
                        String word = e.getKey();
                     if (sp.containsKey(word)) {
                            c1++;
                            spamd = spamd + (-1) * (sp.get(word));
                        }

                        if (nsp.containsKey(word)) {
                            c2++;
                            nonspamd = nonspamd + (-1) * (nsp.get(word));
                        }

                    }
                    System.out.println("c1=" + c1 + "c2=" + c2);
                    double totalspam = spamd + Math.log(0.5);
                    double totalnonspam = nonspamd + Math.log(0.5);
                    if (totalspam > totalnonspam) {
                        System.out.println("\n \n  \t \t It is Spam");
                    } else {
                        System.out.println("\n \n  \t \t It is NonSpam");
                    }

                } catch (Exception e) {
                    e.printStackTrace(System.out);
                }
            }
        //}
    }

}