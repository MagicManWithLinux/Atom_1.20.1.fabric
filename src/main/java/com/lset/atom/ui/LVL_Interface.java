package com.lset.atom.ui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LVL_Interface extends Screen {
    private static final Identifier KACHALKA = Identifier.of("atom","textures/gui/mine_menu.png");
    // Конструктор экрана с заголовком
    public LVL_Interface(){
        super(Text.literal("")); //Добавление текста
    }

    //Метод для отрисовки экрана
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context); //отрисовка фона
        //Открисовка изображения на экране (x,y - координаты)
        int x = (this.width - 256)/2; //Центрирование картинки по горизонтали
        int y = (this.height - 200)/2; //Центрирование картинки по вертикали
        context.drawTexture(KACHALKA,x,y,0,0,256,256);

        //Отрисовка заголовка
        context.drawCenteredTextWithShadow(this.textRenderer,
                this.title,this.width/2,20,0xFFFFFF);//отрисовка заголовка
        super.render(context, mouseX, mouseY, delta);
    }

    //Закрытие экрана при нажатии клавиши Esc
    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == 256){ //256 - это код клавиши Esc
            this.client.setScreen(null); //Закрываем экран
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
}
