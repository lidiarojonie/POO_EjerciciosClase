import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear  4 clientes
        Cliente cl1 = new Cliente("Manolo", "Lopez", "78945612M", LocalDate.of(2007, 12, 15));
        Cliente cl2 = new Cliente("Pedro", "Garcia", "14857627F", LocalDate.of(2000, 02, 05));
        Cliente cl3 = new Cliente("Andrea", "Perez", "78549325K", LocalDate.of(2002, 03, 01));
        Cliente cl4 = new Cliente("Isabel", "Marco", "54862173L", LocalDate.of(1997, 10, 22));

        // Crear varias cuentas para cada cliente
        CuentaProfesional cManolo1 = new CuentaProfesional(1000000, TipoCuenta.PROFESIONAL, LocalDate.now());
        CuentaInfantil cManolo2 = new CuentaInfantil(1000001, TipoCuenta.INFANTIL, LocalDate.now());
        CuentaFamiliar cManolo3 = new CuentaFamiliar(1000002, TipoCuenta.FAMILIAR, LocalDate.now(), "Manolo", "Irene");
        CuentaProfesional cPedro1 = new CuentaProfesional(1000003, TipoCuenta.PROFESIONAL, LocalDate.now());
        CuentaFamiliar cPedro2 = new CuentaFamiliar(1000004, TipoCuenta.FAMILIAR, LocalDate.now(), "Pedro", "Nico");
        CuentaProfesional cAndrea1 = new CuentaProfesional(1000005, TipoCuenta.PROFESIONAL, LocalDate.now());
        CuentaProfesional cIsabel1 = new CuentaProfesional(1000006, TipoCuenta.PROFESIONAL, LocalDate.now());

        // Unir las cuentas al cliente
        cl1.addCuenta(cManolo1);
        cl1.addCuenta(cManolo2);
        cl1.addCuenta(cManolo3);

        cl2.addCuenta(cPedro1);
        cl2.addCuenta(cPedro2);

        cl3.addCuenta(cAndrea1);

        cl4.addCuenta(cIsabel1);

        // Meter dinero en las cuentas
        Movimientos mov1 = new Movimientos(1000000, LocalDate.now(), "Meter dinero", Transaccion.METER, 1200);
        mov1.hacerMovimiento(cManolo1);
        cManolo1.mirarSaldo();

        Movimientos mov2 = new Movimientos(1000001, LocalDate.now(), "Meter dinero", Transaccion.METER, 1234);
        mov2.hacerMovimiento(cManolo2);
        cManolo2.mirarSaldo();

        Movimientos mov3 = new Movimientos(1000002, LocalDate.now(), "Meter dinero", Transaccion.METER, 2450);
        mov3.hacerMovimiento(cPedro1);
        cPedro1.mirarSaldo();

        // Sacar dinero de las cuentas
        Movimientos mov4 = new Movimientos(1000003, LocalDate.now(), "Sacar dinero", Transaccion.SACAR, 100);
        mov4.hacerMovimiento(cManolo2);
        cManolo2.mirarSaldo();

        // Sacar mas dinero del q tienen
        Movimientos mov5 = new Movimientos(1000004, LocalDate.now(), "Sacar mas dinero", Transaccion.SACAR, 2500);
        mov5.hacerMovimiento(cPedro1);
        cPedro1.mirarSaldo();


        // Crear 2 empleados
        Empleado emp1 = new Empleado("Daniel", "Martinez", "14856328P", LocalDate.of(1981, 01, 22), Cargo.ANALISTA, Departamento.FINANZAS);
        Empleado emp2 = new Empleado("Marcos", "Saez", "65894752N", LocalDate.of(1992, 07, 17), Cargo.ANALISTA, Departamento.FINANZAS);

        // Que vean 2 movimientos
        emp1.verMov(mov5);
        emp2.verMov(mov2);
    }
}