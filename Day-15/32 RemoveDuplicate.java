class RemoveDuplicate {
    public static void main(String[] args) {
        int A[]={1,3,4,6,4,7,5,8,5,5,3,4};

        int n=A.length;
        for (int i=0; i<n ;i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {

                    for (int k = j; k < n - 1; k++) {
                        A[k] = A[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
            for (int i=0; i<n; i++){
                System.out.print(A[i]+" ");
            }
        }
    }

