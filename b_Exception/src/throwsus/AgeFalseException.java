package throwsus;

/** @apiNote 自定义异常使用
 * 1:继承父类(Exception)
 * 2:定义构造器，使用super调用父类构造器
 */

class AgeFalseException extends Exception{
    public AgeFalseException() {
    }

    public AgeFalseException(String message) {
        super(message);
    }

    public AgeFalseException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeFalseException(Throwable cause) {
        super(cause);
    }

    public AgeFalseException(String message, Throwable cause,
                             boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
