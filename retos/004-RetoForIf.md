# retoForIf

[reto forIf](https://docs.google.com/spreadsheets/d/1r7Sn8z3HDpUO8PPNc_eL3pTRCEHZ1gl8ybdL6D6aSLw/edit?usp=sharing)


|Planteado|Solución
|-|-
|![reto forIf](/images/retoForIfHojaDeCalculo.png)|![reto forIf](/images/retoForIf.png)

# Plantilla

```
public class retoForIf {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 && j==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
```