    //Variable-Length Argument List
    public static Integer sumArray(Integer...arr) {
        Integer result = 0;
        
        for(Integer ele : arr)
            result += ele;
        
        return result;
    }