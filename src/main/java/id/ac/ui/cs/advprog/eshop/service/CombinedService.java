package id.ac.ui.cs.advprog.eshop.service;
import java.util.List;

public interface CombinedService<T> {
    public T create(T object);
    public List<T> findAll();
    T findById(String objectId);
    public void update(String objectId, T object);
    public boolean deleteObjectById(String objectId);
}