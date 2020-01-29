package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;
import java.util.ArrayList;

//@Entity
public class TransactionInfo {

    private String reference_number;
    private String ext_id;
    private String terminal_ID;
    private String channel_Type;
    private String local_Date_Time;
    private String purpose_Code;
    private String source_Of_Fund;
    private String destination_Code;
    private String transaction_Type;
    private String mode;
    private ArrayList<Source> source;
    private ArrayList<Destination> destination;

    public TransactionInfo() {
    }

    public TransactionInfo(String reference_number, String ext_id, String terminal_ID, String channel_Type, String local_Date_Time, String purpose_Code, String source_Of_Fund, String destination_Code, String transaction_Type, String mode, ArrayList<Source> source, ArrayList<Destination> destination) {
        this.reference_number = reference_number;
        this.ext_id = ext_id;
        this.terminal_ID = terminal_ID;
        this.channel_Type = channel_Type;
        this.local_Date_Time = local_Date_Time;
        this.purpose_Code = purpose_Code;
        this.source_Of_Fund = source_Of_Fund;
        this.destination_Code = destination_Code;
        this.transaction_Type = transaction_Type;
        this.mode = mode;
        this.source = source;
        this.destination = destination;
    }

    public String getReference_number() {
        return reference_number;
    }

    public void setReference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getExt_id() {
        return ext_id;
    }

    public void setExt_id(String ext_id) {
        this.ext_id = ext_id;
    }

    public String getTerminal_ID() {
        return terminal_ID;
    }

    public void setTerminal_ID(String terminal_ID) {
        this.terminal_ID = terminal_ID;
    }

    public String getChannel_Type() {
        return channel_Type;
    }

    public void setChannel_Type(String channel_Type) {
        this.channel_Type = channel_Type;
    }

    public String getLocal_Date_Time() {
        return local_Date_Time;
    }

    public void setLocal_Date_Time(String local_Date_Time) {
        this.local_Date_Time = local_Date_Time;
    }

    public String getPurpose_Code() {
        return purpose_Code;
    }

    public void setPurpose_Code(String purpose_Code) {
        this.purpose_Code = purpose_Code;
    }

    public String getSource_Of_Fund() {
        return source_Of_Fund;
    }

    public void setSource_Of_Fund(String source_Of_Fund) {
        this.source_Of_Fund = source_Of_Fund;
    }

    public String getDestination_Code() {
        return destination_Code;
    }

    public void setDestination_Code(String destination_Code) {
        this.destination_Code = destination_Code;
    }

    public String getTransaction_Type() {
        return transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        this.transaction_Type = transaction_Type;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ArrayList<Source> getSource() {
        return source;
    }

    public void setSource(ArrayList<Source> source) {
        this.source = source;
    }

    public ArrayList<Destination> getDestination() {
        return destination;
    }

    public void setDestination(ArrayList<Destination> destination) {
        this.destination = destination;
    }
}
