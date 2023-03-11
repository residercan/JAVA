package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {


    private int accountNumber; // hesap numarası
    private int pinNumber; //şifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme checkingBalance hesabı için

    //paraCekmeIslemindenSonraKalanMiktar amount:miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance = checkingBalance - amount;

        return checkingBalance;
    }

    //para yatırma checkingBalance hesabı için
    //para yatırma işleminden sonra bakiyeyi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance + amount;

        return checkingBalance;
    }

    //para cekme savingBalance hesabı için
    //savingBalance hesabından para çekildikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount;

        return savingBalance;
    }

    //para yatırma savingBalance hesabı için
    //savingBalance hesabına para yatırdıktan sonra kalan bakiye

    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount;

        return savingBalance;
    }

    //Musteri ile para çekmek için etkileşime gecelim

    //checking hesabından para çekme
    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Çekmek istediğiniz miktarı giriniz:");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sıfır veya eksi rakamlar geçersizdir");
            getCheckingWithdraw();//recursive method // methodu tekrardan çağırma

        } else if(amount<=checkingBalance){
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Hesap bakiyeniz yeterli değil");
        }

    }

    //checking hesabına para yatırma

    public void getCheckingDeposit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        double amount = input.nextDouble();

        if(amount<= 0){
            System.out.println("Sıfır veya eksi rakamlar geçersizdir");
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }

    //savingBalance para çekme
    public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("Çekmek istediğiniz miktarı giriniz:");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sıfır veya eksi rakamlar geçersizdir");
            getSavingWithdraw();//recursive method // methodu tekrardan çağırma

        } else if(amount<=savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        } else {
            System.out.println("Hesap bakiyeniz yeterli değil");
        }

    }

    //savingBalance para yatırma
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        double amount = input.nextDouble();

        if(amount<= 0){
            System.out.println("Sıfır veya eksi rakamlar geçersizdir");
        } else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }
    }


    //son bakiyeyi göster objesi oluşturuyoruz çünkü tekrarlandığı için

    public void displayCurrentAmount(double balance){
        System.out.println("Hesabınızda bulunan bakiye: " + moneyFormat.format(balance));

    }


}
