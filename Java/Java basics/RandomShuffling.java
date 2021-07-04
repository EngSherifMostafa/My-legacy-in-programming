    //Random shuffling
    public static<T> void rShuffling(T[] arr) {
        for(int index = arr.length - 1 ; index >= 0 ; index--) {
            int randomIndex = (int) (Math.random() * (index + 1));
            T temp = arr[index];
            arr[index] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }