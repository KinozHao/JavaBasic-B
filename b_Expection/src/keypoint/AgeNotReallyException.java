package keypoint;

//自定义一个异常继承了父类(Exception) 里面为Exception实现的方法
class AgeNotReallyException extends Exception{
    public AgeNotReallyException() {
    }

    public AgeNotReallyException(String message) {
        super(message);
    }

    public AgeNotReallyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeNotReallyException(Throwable cause) {
        super(cause);
    }

    public AgeNotReallyException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
