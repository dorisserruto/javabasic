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
public interface ILoadManager {
    
   public List<String> getFilesNames(String path, String extension);
}
