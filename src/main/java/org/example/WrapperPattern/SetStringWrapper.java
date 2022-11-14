package org.example.WrapperPattern;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


enum WorldContext {
    RealWorld,
    GlassWorld
}

public class SetStringWrapper extends SetWrapper<String> {


    public SetStringWrapper(Set<String> set, WorldContext worldType) {
        super(set, worldType);
    }

    @Override
    protected boolean isPalindrome(String object) {
        int i = 0, j = object.length() - 1;
        while (i < j){
            if (object.charAt(i++) != object.charAt(j--)) return false;
        }
        return true;
    }

    @Override
    protected String reverse(String object) {
        return new StringBuilder(object).reverse().toString();
    }


}


abstract class SetWrapper<Type> extends ISet<Type> {

    protected WorldContext _worldContext;
    abstract protected boolean isPalindrome(Type object);
    abstract protected Type reverse(Type object);

    public SetWrapper (Set<Type> set, WorldContext worldType){
        _set = set;
        _worldContext = worldType;
    }

    public void setWorldContext (WorldContext worldType){
        _worldContext = worldType;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        Object[] objArray = _set.toArray();
        if (_worldContext == WorldContext.GlassWorld) {
            for (int i = 0; i < objArray.length; i++){
                if (!isPalindrome((Type) objArray[i])) objArray[i] = reverse((Type) objArray[i]);
            }
        }
        return objArray;
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return null;
    }

}


abstract class ISet<Type> implements Set<Type>{
    protected Set<Type> _set;

    @Override
    public int size() {
        return _set.size();
    }

    @Override
    public boolean isEmpty() {
        return _set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return _set.contains(o);
    }

    @NotNull
    @Override
    public Iterator<Type> iterator() { return _set.iterator(); }

    @Override
    public boolean add(Type type) {
        return _set.add(type);
    }

    @Override
    public boolean remove(Object o) {
        return _set.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return _set.containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Type> c) { return _set.addAll(c); }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return _set.retainAll(c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return _set.removeAll(c);
    }

    @Override
    public void clear() {
        _set.clear();
    }
}










