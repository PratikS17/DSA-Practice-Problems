package codingNinjas.DSA.Lecture1_OOPS1;

public class Polynomial {
    private DynamicArray coefficient;

    public Polynomial() {
        coefficient = new DynamicArray();
    }

    public Polynomial(DynamicArray coefficient) {
        this.coefficient = coefficient;
    }
    public void setCoefficient(int degree, int coefficient) {
        this.coefficient.setData(degree , coefficient);
    }

    public void print(){
        for (int i = 0; i <= this.coefficient.size(); i++) {
            if(this.coefficient.getData(i)==0){
                continue;
            }
            else if(i==0){
                System.out.print(this.coefficient.getData(i)+"+");
            }else{
                System.out.print(this.coefficient.getData(i) + "x^"+i+" ");
            }
        }
        System.out.println();
    }

    public Polynomial add(Polynomial p){
        int minDegree = (this.coefficient.size() <  p.coefficient.size()) ? this.coefficient.size() : p.coefficient.size();
        for (int i = 0; i <= minDegree ; i++) {
            int finalCoefficient = this.coefficient.getData(i) + p.coefficient.getData(i);
            this.coefficient.setData(i , finalCoefficient);
        }
        return this;
    }

    public Polynomial subtract(Polynomial p){
        int minDegree = (this.coefficient.size() <  p.coefficient.size()) ? this.coefficient.size() : p.coefficient.size();
        for (int i = 0; i <= minDegree ; i++) {
            int finalCoefficient = this.coefficient.getData(i) - p.coefficient.getData(i);
            this.coefficient.setData(i , finalCoefficient);
        }
        return this;
    }

    public Polynomial multiply(Polynomial p){
        DynamicArray newCoefficient = new DynamicArray();
        for (int i = 0; i <= this.coefficient.size(); i++) {
            if(this.coefficient.getData(i)==0){
                continue;
            }
            for (int j = 0; j <= p.coefficient.size(); j++) {
                if(p.coefficient.getData(j)==0){
                    continue;
                }
                int previousValue=0;
                if(newCoefficient.size() >= (i+j)){
                    previousValue= newCoefficient.getData(i+j);
                }
                int curProduct = this.coefficient.getData(i) * p.coefficient.getData(j);
                newCoefficient.setData(i+j, previousValue+curProduct);
            }
        }
        this.coefficient = newCoefficient;
        return this;
    }

    public class DynamicArray {
        private int data[];
        private int highestDegree;
        public DynamicArray() {
            this.data = new int[5];
            this.highestDegree=0;
        }

        public int size(){
            return highestDegree;
        }

        public void setData(int index , int element) {
            if(index >= data.length){
                restructure();
            }
            data[index] = element;
            if(index > highestDegree){
                highestDegree = index;
            }
        }

        private void restructure() {
            int temp[] = data;
            data = new int[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }

        public int getData(int index) {
            return data[index];
        }
    }
}
