package elevator_design;

public class ElevatorRequest {
    public InternalButton internalButton;

    public ExternalButton externalButton;


    public ElevatorRequest(InternalButton internalButton, ExternalButton externalButton) {
        this.internalButton = internalButton;
        this.externalButton = externalButton;
    }



    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }
}
