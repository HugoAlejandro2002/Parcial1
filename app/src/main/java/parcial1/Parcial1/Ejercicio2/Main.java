package parcial1.Parcial1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TelevisorPrototype tv1 = new TelevisorPrototype();
        tv1.setSo("android");
        tv1.setVersionSistema("11.0");
        tv1.setPulgadas(80);
        tv1.setResolucion(50);
        tv1.setPuertoHDMI(true);
        tv1.setPuertosUSB(4);
        tv1.setControlRemoto(true);
        tv1.setBluetooth(true);
        tv1.setSerialTelevisor("10ada291");
        tv1.showInfo();

        TelevisorPrototype tv2 = tv1.clone();
        tv2.setSerialTelevisor("1098767ds");
        tv2.showInfo();

        TelevisorPrototype tv3 = tv1.clone();
        tv3.setSerialTelevisor("781237ks12");
        tv3.showInfo();

        TelevisorPrototype tv4 = tv1.clone();
        tv4.setSerialTelevisor("9929aja87");
        tv4.showInfo();

        TelevisorPrototype tv5 = tv1.clone();
        tv5.setSerialTelevisor("1892asj10");
        tv5.showInfo();
    }
}
