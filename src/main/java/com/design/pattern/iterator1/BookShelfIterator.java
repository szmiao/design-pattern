package com.design.pattern.iterator1;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 17:14:08
 **/
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
