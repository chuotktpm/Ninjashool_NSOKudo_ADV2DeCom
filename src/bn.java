import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class bn extends Form implements CommandListener {
   private final TextField aaa;
   private final TextField aba;
   private final TextField aca;
   private final TextField ada;
   private final TextField aea;
   private final TextField afa;
   private final Command aga;

   public bn() {
      super("Cài khu chờ pk và đánh pk");
      this.append(this.aaa = new TextField("Khu chờ PK:", String.valueOf(Code.bua), 2, 2));
      this.append(this.aba = new TextField("Khu đánh PK:", String.valueOf(Code.bva), 2, 2));
      this.append(this.aca = new TextField("ID map PK - (map hiện tại: " + gn.aoa + ")", Code.bwa != -1 ? String.valueOf(Code.bwa) : "70", 3, 2));
      this.append(this.ada = new TextField("Vị trí X - (vt hiện tại: " + fz.ala().ala + ")", Code.bxa != -1 ? String.valueOf(Code.bxa) : "1500", 9, 2));
      this.append(this.aea = new TextField("Vị trí Y - (vt hiện tại: " + fz.ala().ama + ")", Code.bya != -1 ? String.valueOf(Code.bya) : "528", 9, 2));
      this.append("Lưu ý: những cài đặt này cả 3 acc phải cài giống hệt nhau!");
      this.append(this.afa = new TextField("Bao nhiêu % thì auto UpPK:", String.valueOf(Code.bza), 2, 2));
      this.append("P/s: Cài đặt này dành cho acc chính!");
      this.addCommand(this.aga = new Command("Save", 4, 0));
      this.addCommand(new Command("Cancel", 7, 0));
      this.setCommandListener(this);
   }

   public final void aaa() {
      Display.getDisplay(Class_ab.aja).setCurrent(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.aga) {
         try {
            Code.bua = Integer.parseInt(this.aaa.getString());
            Code.bva = Integer.parseInt(this.aba.getString());
            Code.bwa = Integer.parseInt(this.aca.getString());
            Code.bxa = Integer.parseInt(this.ada.getString());
            Code.bya = Integer.parseInt(this.aea.getString());
            Code.bza = Long.parseLong(this.afa.getString());
            fd.aaa("chipAutopk", Code.bua + ";" + Code.bva + ";" + Code.bwa + ";" + Code.bxa + ";" + Code.bya + ";" + (int)Code.bza);
            ab.aaa("Lưu cài đặt thành công");
         } catch (NumberFormatException var3) {
         }
      }

      Display.getDisplay(Class_ab.aja).setCurrent(fg.aaa());
   }
}
