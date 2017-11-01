/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package explorer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zethiel
 */
public class LoadManager implements ILoadManager{

    public List<String> getFilesNames(String path, String extension) {
        List<String> lstFilesNames = new ArrayList<String>();

        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if(listFiles[i].getName().toUpperCase().endsWith(extension.toUpperCase()))
                    lstFilesNames.add(listFiles[i].getName());
            }
        }
        
        return lstFilesNames;
    }
}
