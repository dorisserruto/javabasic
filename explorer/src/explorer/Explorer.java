/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package explorer;

import java.util.List;

/**
 *
 * @author Zethiel
 */
public class Explorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoadManager lm = new LoadManager();
        List<String> filesNames = lm.getFilesNames("E:\\VIDEOS TERMINADOS", ".txt");
        
        //Demo Impresion
        for (String fileName : filesNames) {
            System.out.println("File:"+fileName);
        }
    }
}
