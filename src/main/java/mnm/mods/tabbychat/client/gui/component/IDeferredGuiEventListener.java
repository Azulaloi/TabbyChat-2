package mnm.mods.tabbychat.client.gui.component;

import net.minecraft.client.gui.IGuiEventListener;

public interface IDeferredGuiEventListener extends IGuiEventListener {

    IGuiEventListener deferred();

    @Override
    default void func_212927_b(double p_212927_1_, double p_212927_3_) {
        deferred().func_212927_b(p_212927_1_, p_212927_3_);
    }

    @Override
    default boolean mouseClicked(double p_mouseClicked_1_, double p_mouseClicked_3_, int p_mouseClicked_5_) {
        return deferred().mouseClicked(p_mouseClicked_1_, p_mouseClicked_3_, p_mouseClicked_5_);
    }

    @Override
    default boolean mouseReleased(double p_mouseReleased_1_, double p_mouseReleased_3_, int p_mouseReleased_5_) {
        return deferred().mouseReleased(p_mouseReleased_1_, p_mouseReleased_3_, p_mouseReleased_5_);
    }

    @Override
    default boolean mouseDragged(double p_mouseDragged_1_, double p_mouseDragged_3_, int p_mouseDragged_5_, double p_mouseDragged_6_, double p_mouseDragged_8_) {
        return deferred().mouseDragged(p_mouseDragged_1_, p_mouseDragged_3_, p_mouseDragged_5_, p_mouseDragged_6_, p_mouseDragged_8_);
    }

    @Override
    default boolean mouseScrolled(double p_mouseScrolled_1_, double p_mouseScrolled_3_, double p_mouseScrolled_5_) {
        return deferred().mouseScrolled(p_mouseScrolled_1_, p_mouseScrolled_3_, p_mouseScrolled_5_);
    }

    @Override
    default boolean keyPressed(int p_keyPressed_1_, int p_keyPressed_2_, int p_keyPressed_3_) {
        return deferred().keyPressed(p_keyPressed_1_, p_keyPressed_2_, p_keyPressed_3_);
    }

    @Override
    default boolean keyReleased(int p_keyReleased_1_, int p_keyReleased_2_, int p_keyReleased_3_) {
        return deferred().keyReleased(p_keyReleased_1_, p_keyReleased_2_, p_keyReleased_3_);
    }

    @Override
    default boolean charTyped(char p_charTyped_1_, int p_charTyped_2_) {
        return deferred().charTyped(p_charTyped_1_, p_charTyped_2_);
    }

    @Override
    default boolean changeFocus(boolean p_changeFocus_1_) {
        return deferred().changeFocus(p_changeFocus_1_);
    }

    @Override
    default boolean isMouseOver(double p_isMouseOver_1_, double p_isMouseOver_3_) {
        return deferred().isMouseOver(p_isMouseOver_1_, p_isMouseOver_3_);
    }
}
