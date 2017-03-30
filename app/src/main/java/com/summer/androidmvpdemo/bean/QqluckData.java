package com.summer.androidmvpdemo.bean;

/**
 * Created by xuyang on 2017/3/1.
 */

public class QqluckData {

    /**
     * status : 0
     * msg : ok
     * result : {"qq":"22222","score":"62","luck":"凶","content":"烦闷懊恼，事事难展，自防灾祸，始免困境","character":"要面包不要爱情","characterdetail":"责任心重，尤其对工作充满热诚，是个彻头彻尾工作狂。但往往因为过分专注职务，而忽略身边的家人及朋友，是个宁要面包不需要爱情的理性主义者。"}
     */

    private String status;
    private String msg;
    private ResultEntity result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public static class ResultEntity {
        /**
         * qq : 22222
         * score : 62
         * luck : 凶
         * content : 烦闷懊恼，事事难展，自防灾祸，始免困境
         * character : 要面包不要爱情
         * characterdetail : 责任心重，尤其对工作充满热诚，是个彻头彻尾工作狂。但往往因为过分专注职务，而忽略身边的家人及朋友，是个宁要面包不需要爱情的理性主义者。
         */

        private String qq;
        private String score;
        private String luck;
        private String content;
        private String character;
        private String characterdetail;

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getLuck() {
            return luck;
        }

        public void setLuck(String luck) {
            this.luck = luck;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        public String getCharacterdetail() {
            return characterdetail;
        }

        public void setCharacterdetail(String characterdetail) {
            this.characterdetail = characterdetail;
        }
    }
}
