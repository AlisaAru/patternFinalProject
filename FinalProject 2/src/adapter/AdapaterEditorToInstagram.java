package adapter;

import adapter.Instagram;
import adapter.PhotoEditor;

public class AdapaterEditorToInstagram extends PhotoEditor implements Instagram {
    @Override
    public void save() {
        savePhoto();
    }

    @Override
    public void edit() {
        editPhoto();
    }

    @Override
    public void delete() {
        deletePhoto();
    }
}
