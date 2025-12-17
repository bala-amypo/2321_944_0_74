package com.example.demo.newserviceimpl;
import java.util.List;
import org.framework.stereotype.Service;
import com.example.demo.newservice.NewFileEntity;
import com.example.demo.newservice.NewFileService;
public class NewFileServiceImpl implements NewFileService{
    private final NewFileRepo rep;
    public NewFileServiceImpl(NewFileRepo rep)
    @Override
    public NewFileEntity savedata(NewFileEntity newfile){
        this.rep=rep;
    }
    @Override
    public NewFileEntity getidval(Long id){
        return rep.save(newfile);//post
    }
    @Override
    public List<NewFileEntity> getall(){
        
    }
    @Override
    public NewFileEntity update(Long id,NewFileEntity newfile){

    }
    @Override
    public void delete(Long id){

    }
}