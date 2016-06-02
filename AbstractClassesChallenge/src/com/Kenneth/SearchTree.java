package com.Kenneth;

/**
 * Created by Kenneth on 6/1/2016.
 */
public class SearchTree implements NodeList {
    private  ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                   currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }
        return false;
    }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
    }
        ListItem currentItem = this.root;
        ListItem parrentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parrentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison < 0) {
                parrentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                //equals: we've found the item so remove it
                performRemoval(currentItem, parrentItem);
                return true;
            }
        }
        return false; }

    @Override
    public void traverse(ListItem root) {
        if( root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
