package collections;

import collections.exceptions.CheckedException;
import collections.iterator.HashIterator;
import collections.iterator.Iterable;
import collections.iterator.Iterator;

public class Hash<T> extends Origin implements Iterable<T>
{
    LinkedList<HashNode<T>>[] hash;
    Integer capacity = 0;
    Integer elements = 0;
    
    @SuppressWarnings("unchecked")
    public Hash(Integer capacity) {
        this.capacity = capacity;
        this.hash = (LinkedList<HashNode<T>>[])(new LinkedList[this.capacity]);
        for (int i = 0; i < this.hash.length; i++) {
            this.hash[i] = new LinkedList<>();   
        }
    }


    @SuppressWarnings("unchecked")
    public Hash() {
        this.capacity = 256;
        this.hash = (LinkedList<HashNode<T>>[])(new LinkedList[this.capacity]);
        for (int i = 0; i < this.hash.length; i++) {
            this.hash[i] = new LinkedList<>();   
        }
    }


    @SuppressWarnings("unchecked")
    public void add(T value, Integer key){

        
        if ((elements * 100/capacity)/capacity > 70) {
            
            this.capacity *= 2;
            LinkedList<HashNode<T>>[] copy = (LinkedList<HashNode<T>>[])(new LinkedList[this.capacity]); 

            for (int i = 0; i < copy.length; i++) {
                copy[i] = new LinkedList<>();   
            }

            for (int i = 0; i < hash.length; i++) {
                if (hash[i] == null) {
                    continue;
                }

                for (int j = 0; j < hash[i].getSize(); j++) {

                    HashNode<T> copy_hashNode = new HashNode<>(key, value);
                    copy_hashNode.setIndex(hash[i].get(j).getIndex()); 
                    copy_hashNode.setValue(hash[i].get(j).getValue()); 

                    copy[copy_hashNode.getIndex() % this.capacity].add(copy_hashNode);
                }
            }    

                HashNode<T> hashNode = new HashNode<>(key, value);
                copy[hashNode.getIndex() % this.capacity].add(hashNode);
            }    
        }


        public T get(int index) throws CheckedException {
            
            if (hash[index % this.capacity] == null) {
                
                throw new CheckedException("Index invalido pai");
            }
            
            for (int i = 0; i < hash[index % this.capacity].getSize(); i++) {
                
                if(hash[index % this.capacity].get(i).getIndex() != index) {
                    continue;
                }
                
                return hash[index % this.capacity].get(i).getValue();
            }
            
            throw new CheckedException("Index invalido pai");

        }


        @Override
        public Iterator<T> iterator() {
            return new HashIterator<>(hash);
        }


        @Override
        public Stream<T> stream() {
            return new Stream<>(this);
        }



    }


    


































    // private Integer capacity = 0;
    // private Integer elements = 0;

    // @SuppressWarnings("unchecked")
    // public Hash(){
    //     this.capacity = 256;
    //     this.hash = (LinkedList<T>[])(new LinkedList[capacity]);
    //     for(int i = 0; i < this.capacity; i++){
    //         hash[i] = new LinkedList<T>();
    //     }
    // }
    
    // @SuppressWarnings("unchecked")
    // public Hash(Integer capacity){
    //     this.hash = (LinkedList<T>[])(new LinkedList[capacity]);
    //     this.capacity = capacity;
    //     for(int i = 0; i < this.capacity; i++){
    //         hash[i] = new LinkedList<T>();
    //     }
    // }

    // public void add(T value){

    //     if(((this.elements * 100)/ this.capacity) / this.capacity >= 70){
    //         this.capacity *= 2;
    //         @SuppressWarnings("unchecked")
    //         LinkedList<T>[] copy = (LinkedList<T>[])(new LinkedList[capacity]);
    //         for(int i=0; i < this.capacity; i++){
    //             copy[i] = new LinkedList<T>();
    //         }
            
    //         for(int i=0; i<hash.length; i++){
    //             for(int j=0; j<hash[i].getSize(); j++){
    //                 Integer index_copy = Math.abs((hash[i].get(j).hashCode()) % capacity); 
    //                 copy[index_copy].add(hash[i].get(j));
    //             }
    //         }
    //         this.hash = copy;
    //     }

    //     Integer index = Math.abs(value.hashCode() % (capacity)); 
    //     hash[index].add(value);
    //     this.elements++;
    //     setSize(elements);
    // }

    // public T get(T value){
    //     Integer index = Math.abs(value.hashCode()%capacity);
    //     for (int i=0; i<hash[index].getSize(); i++){
    //         if(hash[index].get(i).equals(value)){
    //             return hash[index].get(i);
    //         }
    //     }
    //     throw new CheckedException("Indice inválido paizao");
    // }

    // @Override
    // public Iterator<T> iterator() {
    //     return new HashIterator<>(this.hash);
    // }

    // @Override
    // public Stream<T> stream() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'stream'");
    // }
// }