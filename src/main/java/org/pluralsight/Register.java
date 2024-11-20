package org.pluralsight;

class Register {
    private enum Status{
        OPEN,
        CLOSED,
        INSUFFICIENT_FUNDS
    };
    private Status status;
    private String[] change;

    Status getStatus(){
        return status;
    };
    void setStatus(String newStatus){
    this.status = Status.valueOf(newStatus);
    }
}

