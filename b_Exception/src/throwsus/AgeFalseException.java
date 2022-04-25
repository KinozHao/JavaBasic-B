package throwsus;

/** @apiNote �Զ����쳣ʹ��
 * 1:�̳и���(Exception)
 * 2:���幹������ʹ��super���ø��๹����
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
