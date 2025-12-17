package com.example.demo.newservice;
import com.eample.demo.newentity.NewFileEntity;
public interface NewFileService{
    NewFileEntity  savedata(NewFileEntity newfile);
    NewFileEntity getidval(Long id);
}