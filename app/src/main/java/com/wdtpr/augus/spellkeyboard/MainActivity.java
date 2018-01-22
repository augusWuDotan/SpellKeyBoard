package com.wdtpr.augus.spellkeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wdtpr.augus.spellkeyboard.model.listener.SpellKeyBoardListener;
import com.wdtpr.augus.spellkeyboard.widget.SpellKeyBoard;

public class MainActivity extends AppCompatActivity implements SpellKeyBoardListener {
    SpellKeyBoard mSpellKeyBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpellKeyBoard = (SpellKeyBoard) findViewById(R.id.mSpellKeyBoard);
        //設定答案
        mSpellKeyBoard.setAnswer("Good morning");
        /**
         * set 按鍵數
         * [count]<24 && [count]>=12 (需要3的倍數) ex 12,15,18,21
         * [count]<=40 && [count]>=23(需要4的倍數) ex 24,28,32,36,40
         */
        mSpellKeyBoard.setKeyBoardNum(24);
        /**
         * 設定版型
         */
        mSpellKeyBoard.setmType(1);// 1:答案格藍底 2:答案格黃底
        /**
         * 設定答案格內有答案時 padding數 (按鍵)
         */
        mSpellKeyBoard.setKeyBoardItemPadding(2);
        /**
         * 設定答案作答完畢 動畫延遲幾秒
         */
        mSpellKeyBoard.setAnimateDelay(3000);
        /**
         * 設定答案錯誤多久後判斷
         */
        mSpellKeyBoard.setAnimateErrorDelay(1000);
        /**
         * 設定callback
         */
        mSpellKeyBoard.listener = this;
    }


    @Override
    public void alreadyEstablished() {

    }

    @Override
    public void update() {
        Toast.makeText(this, "更新完成", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void updateError() {
        Toast.makeText(this, "更新錯誤", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void alreadyBack() {
        Toast.makeText(this, "刪除", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void alreadyAdd() {
        Toast.makeText(this, "新增", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void answerError(String s) {
        Toast.makeText(this, "錯誤資訊：" + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void answerCorrect(String s) {
        Toast.makeText(this, "正確資訊：" + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void answerCorrectAnimFinish() {
        Toast.makeText(this, "動畫結束", Toast.LENGTH_SHORT).show();
    }
}
