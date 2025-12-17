package com.example.demo.newservice;
import com.example.demo.newentity.NewFileEntity;
public interface NewFileService{
    NewFileEntity savedata(NewFileEntity newfile);
    NewFileEntity getidval(Long id);
    List<NewFileEntity> getall();
    NewFileEntity update(Long id,NewFileEntity newfile)
    NewFileEntity delete(Long id,void)
}