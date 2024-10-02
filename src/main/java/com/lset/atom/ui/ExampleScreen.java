package com.lset.atom.ui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ExampleScreen extends Screen {

    // Конструктор экрана с заголовком
    public ExampleScreen(){
        super(Text.literal("Example GUI"));

    }

    //Метод для отрисовки экрана
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context); //отрисовка фона
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
