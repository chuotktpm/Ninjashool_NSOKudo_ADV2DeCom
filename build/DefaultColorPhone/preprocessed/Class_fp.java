
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class Class_fp implements CommandListener {
   private final Form d = new Form("Setting Gom Đồ!");
   private TextField e;
   private TextField f;
   private TextField g;
   private TextField h;
   private TextField i;
   private TextField j;
   private TextField k;
   private Command l;
   public static String a = "807,808,809,810,811,812,813,607,608,609,610";
   public static String b = "454,455,456,457";
   private final ChoiceGroup m;
   public static byte c = 1;

   public Class_fp() {
      boolean var1 = Class_fj.a == null;
      this.e = new TextField("Name nhận đồ", var1 ? "vth" : Class_fj.a, 100, 0);
      this.f = new TextField("Giờ nhận đồ", var1 ? "0" : String.valueOf(Class_fj.b), 2, 2);
      this.g = new TextField("Item GD <Mỗi ID cách nhau bằng dấu phảy > Nhập id item", a, 1000, 0);
      this.k = new TextField("Item Cất <Mỗi ID cách nhau bằng dấu phảy > Nhập id item", b, 1000, 0);
      this.m = new ChoiceGroup("Auto Cất đồ vào rương khi up !", 1, new String[]{"Bật", "Tắt"}, new Image[2]);
      this.h = new TextField("Phút nhận đồ", var1 ? "0" : String.valueOf(Class_fj.c), 2, 2);
      this.i = new TextField("Map nhận đồ", var1 ? "22" : String.valueOf(Class_fj.d), 4, 2);
      this.j = new TextField("Khu Vực nhận", var1 ? "20" : String.valueOf(Class_fj.e), 3, 2);
      this.l = new Command("Lưu", 4, 0);
   }

   public final void a() {
      this.d.append(this.e);
      this.d.append(this.g);
      this.d.append(this.f);
      this.d.append(this.h);
      this.d.append(this.i);
      this.d.append(this.j);
      this.d.append(this.m);
      this.d.append(this.k);
      this.d.addCommand(this.l);
      this.d.addCommand(new Command("Thoát", 7, 0));
      this.m.setSelectedIndex(c, true);
      this.d.setCommandListener(this);
      a(this.d);
   }

   private static void a(Displayable var0) {
      Display.getDisplay(GameMidlet.instance).setCurrent(var0);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.l) {
         Class_fj.a = this.e.getString();
         a = this.g.getString();
         b = this.k.getString();

         try {
            c = (byte)this.m.getSelectedIndex();
            Class_fj.b = Byte.parseByte(this.f.getString());
            Class_fj.c = Byte.parseByte(this.h.getString());
            Class_fj.d = Integer.parseInt(this.i.getString());
            Class_fj.e = Byte.parseByte(this.j.getString());
         } catch (Exception var4) {
         }

         GameCanvas.setText("Lưu cài đặt thành công");
         Class_fj.n();
      }

      a(MotherCanvas.getInstance());
   }
}
