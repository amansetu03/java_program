class mam{
    /**
     * @param args
     */
    public static void main(String[] args){
    int[][] a= {
            {1,0,1,1},
            {1,1,1,1},
            {1,1,1,1},
        };
       int b=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                b[i][j]=a[i][j];
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.println(b[i][j]);
            }

    }
} }            