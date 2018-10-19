package DesignPatterns.factory;

/**
 * Created by admin on 2018/10/19.
 */
public interface IMyMessageFactory {
    public IMyMessage createMessage(String messageType);
}
