package lecture02.Additional_materials.Ex006.Interface;

import lecture02.Additional_materials.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
