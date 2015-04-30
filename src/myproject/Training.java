package myproject;



import java.io.*;
import java.util.*;

public class Training {
     
       public static void main(String[] args) {   
        File spamloc = new File("E:\\project\\spam");
        File nonspamloc = new File("E:\\project\\Non-spam");
        getWordCountSpam(spamloc);
        getWordCountNonSpam(nonspamloc);
    }
    public static void getWordCountNonSpam(File folder){
		int nonspam=0;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
	 	File[] listofFiles = folder.listFiles();
		for(File f:listofFiles){
			if(f.isFile()){
				System.out.println(nonspam + " "+ f.getName());
				nonspam++;
				try{
					Scanner s = new Scanner(f).useDelimiter("[^a-zA-Z]");
					while(s.hasNext()){
						String word = s.next().toLowerCase();
						if(hm.containsKey(word)){
							hm.put(word,hm.get(word)+1);
						}
						else{
							hm.put(word,1);
						}
				
					}
					
				}
				catch(Exception e){	
					e.printStackTrace(System.out);
				}
			}
		
		}
		 try{
			int vocabSize = 264821;
			double num=0;
			double p=0;
		        double den=1;
			int nonspamSize = hm.size();
                        PrintWriter writer = new PrintWriter("E:\\project\\myproject\\src\\myproject\\nonspamVector");
			for(Map.Entry<String,Integer>e:hm.entrySet()){
				num = e.getValue()+1;
				den = nonspamSize + vocabSize;
				double ratio = num/den;
				p=Math.log(ratio);
                        	writer.write(e.getKey()+" " + p);
				writer.println();
                        }
                	writer.close();
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}

	}
    public static void getWordCountSpam(File folder){
		int spam=0;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
	 	File[] listofFiles = folder.listFiles();
		for(File f:listofFiles){
			if(f.isFile()){
				System.out.println(spam + " "+ f.getName());
				spam++;
				try{
					Scanner s = new Scanner(f).useDelimiter("[^a-zA-Z]");
					while(s.hasNext()){
						String word = s.next().toLowerCase();
						if(hm.containsKey(word)){
							hm.put(word,hm.get(word)+1);
						}
						else{
							hm.put(word,1);
						}
				
					}
					
				}
				catch(Exception e){
					e.printStackTrace(System.out);
				}
			}
		
		}
		 try{
			int vocabSize = 264821;
			double num=0;
			double p=0;
		        double den=1;
			int spamSize = hm.size();
   			PrintWriter writer = new PrintWriter("E:\\project\\myproject\\src\\myproject\\spamVector");
			for(Map.Entry<String,Integer>e:hm.entrySet()){
				num = e.getValue()+1;
				den = spamSize + vocabSize;
				double ratio = num/den;
				p=Math.log(ratio);
                        	writer.write(e.getKey()+" " + p);
				writer.println();
                                
                        }
                        
                	writer.close();
		}
		catch(Exception e){
			e.printStackTrace(System.out);
		}

    }
}
