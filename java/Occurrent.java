import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Occurrent
 * <p>
 * A processual entity
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enables",
    "has_input",
    "has_output",
    "has_participant",
    "negatively_regulates_process_to_process",
    "positively_regulates_process_to_process",
    "precedes",
    "regulates_process_to_process"
})
public class Occurrent {

    /**
     * holds between a physical entity and a process, where the physical entity executes the process
     * 
     */
    @JsonProperty("enables")
    @JsonPropertyDescription("holds between a physical entity and a process, where the physical entity executes the process")
    private List<String> enables = new ArrayList<String>();
    /**
     * holds between a process and a continuant, where the continuant is an input into the process
     * 
     */
    @JsonProperty("has_input")
    @JsonPropertyDescription("holds between a process and a continuant, where the continuant is an input into the process")
    private List<String> hasInput = new ArrayList<String>();
    /**
     * holds between a process and a continuant, where the continuant is an output of the process
     * 
     */
    @JsonProperty("has_output")
    @JsonPropertyDescription("holds between a process and a continuant, where the continuant is an output of the process")
    private List<String> hasOutput = new ArrayList<String>();
    /**
     * holds between a process and a continuant, where the continuant is somehow involved in the process
     * 
     */
    @JsonProperty("has_participant")
    @JsonPropertyDescription("holds between a process and a continuant, where the continuant is somehow involved in the process")
    private List<String> hasParticipant = new ArrayList<String>();
    @JsonProperty("negatively_regulates_process_to_process")
    private List<String> negativelyRegulatesProcessToProcess = new ArrayList<String>();
    @JsonProperty("positively_regulates_process_to_process")
    private List<String> positivelyRegulatesProcessToProcess = new ArrayList<String>();
    /**
     * holds between two processes, where one completes before the other begins
     * 
     */
    @JsonProperty("precedes")
    @JsonPropertyDescription("holds between two processes, where one completes before the other begins")
    private List<String> precedes = new ArrayList<String>();
    @JsonProperty("regulates_process_to_process")
    private List<String> regulatesProcessToProcess = new ArrayList<String>();

    /**
     * holds between a physical entity and a process, where the physical entity executes the process
     * 
     */
    @JsonProperty("enables")
    public List<String> getEnables() {
        return enables;
    }

    /**
     * holds between a physical entity and a process, where the physical entity executes the process
     * 
     */
    @JsonProperty("enables")
    public void setEnables(List<String> enables) {
        this.enables = enables;
    }

    /**
     * holds between a process and a continuant, where the continuant is an input into the process
     * 
     */
    @JsonProperty("has_input")
    public List<String> getHasInput() {
        return hasInput;
    }

    /**
     * holds between a process and a continuant, where the continuant is an input into the process
     * 
     */
    @JsonProperty("has_input")
    public void setHasInput(List<String> hasInput) {
        this.hasInput = hasInput;
    }

    /**
     * holds between a process and a continuant, where the continuant is an output of the process
     * 
     */
    @JsonProperty("has_output")
    public List<String> getHasOutput() {
        return hasOutput;
    }

    /**
     * holds between a process and a continuant, where the continuant is an output of the process
     * 
     */
    @JsonProperty("has_output")
    public void setHasOutput(List<String> hasOutput) {
        this.hasOutput = hasOutput;
    }

    /**
     * holds between a process and a continuant, where the continuant is somehow involved in the process
     * 
     */
    @JsonProperty("has_participant")
    public List<String> getHasParticipant() {
        return hasParticipant;
    }

    /**
     * holds between a process and a continuant, where the continuant is somehow involved in the process
     * 
     */
    @JsonProperty("has_participant")
    public void setHasParticipant(List<String> hasParticipant) {
        this.hasParticipant = hasParticipant;
    }

    @JsonProperty("negatively_regulates_process_to_process")
    public List<String> getNegativelyRegulatesProcessToProcess() {
        return negativelyRegulatesProcessToProcess;
    }

    @JsonProperty("negatively_regulates_process_to_process")
    public void setNegativelyRegulatesProcessToProcess(List<String> negativelyRegulatesProcessToProcess) {
        this.negativelyRegulatesProcessToProcess = negativelyRegulatesProcessToProcess;
    }

    @JsonProperty("positively_regulates_process_to_process")
    public List<String> getPositivelyRegulatesProcessToProcess() {
        return positivelyRegulatesProcessToProcess;
    }

    @JsonProperty("positively_regulates_process_to_process")
    public void setPositivelyRegulatesProcessToProcess(List<String> positivelyRegulatesProcessToProcess) {
        this.positivelyRegulatesProcessToProcess = positivelyRegulatesProcessToProcess;
    }

    /**
     * holds between two processes, where one completes before the other begins
     * 
     */
    @JsonProperty("precedes")
    public List<String> getPrecedes() {
        return precedes;
    }

    /**
     * holds between two processes, where one completes before the other begins
     * 
     */
    @JsonProperty("precedes")
    public void setPrecedes(List<String> precedes) {
        this.precedes = precedes;
    }

    @JsonProperty("regulates_process_to_process")
    public List<String> getRegulatesProcessToProcess() {
        return regulatesProcessToProcess;
    }

    @JsonProperty("regulates_process_to_process")
    public void setRegulatesProcessToProcess(List<String> regulatesProcessToProcess) {
        this.regulatesProcessToProcess = regulatesProcessToProcess;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Occurrent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enables");
        sb.append('=');
        sb.append(((this.enables == null)?"<null>":this.enables));
        sb.append(',');
        sb.append("hasInput");
        sb.append('=');
        sb.append(((this.hasInput == null)?"<null>":this.hasInput));
        sb.append(',');
        sb.append("hasOutput");
        sb.append('=');
        sb.append(((this.hasOutput == null)?"<null>":this.hasOutput));
        sb.append(',');
        sb.append("hasParticipant");
        sb.append('=');
        sb.append(((this.hasParticipant == null)?"<null>":this.hasParticipant));
        sb.append(',');
        sb.append("negativelyRegulatesProcessToProcess");
        sb.append('=');
        sb.append(((this.negativelyRegulatesProcessToProcess == null)?"<null>":this.negativelyRegulatesProcessToProcess));
        sb.append(',');
        sb.append("positivelyRegulatesProcessToProcess");
        sb.append('=');
        sb.append(((this.positivelyRegulatesProcessToProcess == null)?"<null>":this.positivelyRegulatesProcessToProcess));
        sb.append(',');
        sb.append("precedes");
        sb.append('=');
        sb.append(((this.precedes == null)?"<null>":this.precedes));
        sb.append(',');
        sb.append("regulatesProcessToProcess");
        sb.append('=');
        sb.append(((this.regulatesProcessToProcess == null)?"<null>":this.regulatesProcessToProcess));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.precedes == null)? 0 :this.precedes.hashCode()));
        result = ((result* 31)+((this.positivelyRegulatesProcessToProcess == null)? 0 :this.positivelyRegulatesProcessToProcess.hashCode()));
        result = ((result* 31)+((this.hasOutput == null)? 0 :this.hasOutput.hashCode()));
        result = ((result* 31)+((this.regulatesProcessToProcess == null)? 0 :this.regulatesProcessToProcess.hashCode()));
        result = ((result* 31)+((this.negativelyRegulatesProcessToProcess == null)? 0 :this.negativelyRegulatesProcessToProcess.hashCode()));
        result = ((result* 31)+((this.hasInput == null)? 0 :this.hasInput.hashCode()));
        result = ((result* 31)+((this.hasParticipant == null)? 0 :this.hasParticipant.hashCode()));
        result = ((result* 31)+((this.enables == null)? 0 :this.enables.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Occurrent) == false) {
            return false;
        }
        Occurrent rhs = ((Occurrent) other);
        return (((((((((this.precedes == rhs.precedes)||((this.precedes!= null)&&this.precedes.equals(rhs.precedes)))&&((this.positivelyRegulatesProcessToProcess == rhs.positivelyRegulatesProcessToProcess)||((this.positivelyRegulatesProcessToProcess!= null)&&this.positivelyRegulatesProcessToProcess.equals(rhs.positivelyRegulatesProcessToProcess))))&&((this.hasOutput == rhs.hasOutput)||((this.hasOutput!= null)&&this.hasOutput.equals(rhs.hasOutput))))&&((this.regulatesProcessToProcess == rhs.regulatesProcessToProcess)||((this.regulatesProcessToProcess!= null)&&this.regulatesProcessToProcess.equals(rhs.regulatesProcessToProcess))))&&((this.negativelyRegulatesProcessToProcess == rhs.negativelyRegulatesProcessToProcess)||((this.negativelyRegulatesProcessToProcess!= null)&&this.negativelyRegulatesProcessToProcess.equals(rhs.negativelyRegulatesProcessToProcess))))&&((this.hasInput == rhs.hasInput)||((this.hasInput!= null)&&this.hasInput.equals(rhs.hasInput))))&&((this.hasParticipant == rhs.hasParticipant)||((this.hasParticipant!= null)&&this.hasParticipant.equals(rhs.hasParticipant))))&&((this.enables == rhs.enables)||((this.enables!= null)&&this.enables.equals(rhs.enables))));
    }

}