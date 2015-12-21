package com.logistic.impl2.model.transport;

/**
 * Created by Sergey on 06.11.2015.
 */
import com.logistic.api.model.post.PostOffice;


public class DeliveryTransport implements com.logistic.api.model.transport.DeliveryTransport {
    private Type type;
    private PostOffice startOffice;
    private PostOffice destinationOffice;

    public DeliveryTransport(Type type, PostOffice startOffice, PostOffice destinationOffice) {
        setDestinationOffice(destinationOffice);
        setStartOffice(startOffice);
        setType(type);
    }

    private DeliveryTransport setType(Type type) {
        this.type = type;
        if(this.type == null){
            throw new RuntimeException("Type can't be null!");
        }
        return this;
    }

    private DeliveryTransport setStartOffice(PostOffice startOffice) {
        this.startOffice = startOffice;
        if(this.startOffice == null){
            throw new RuntimeException("StartOffice can't be null!");
        }
        return this;
    }

    private DeliveryTransport setDestinationOffice(PostOffice destinationOffice) {
        this.destinationOffice = destinationOffice;
        if(this.destinationOffice == null){
            throw new RuntimeException("DestinationOffice can't be null!");
        }
        return this;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public PostOffice getStartPostOffice() {
        return this.startOffice;
    }

    @Override
    public PostOffice getDestinationPostOffice() {
        return this.destinationOffice;
    }
}

