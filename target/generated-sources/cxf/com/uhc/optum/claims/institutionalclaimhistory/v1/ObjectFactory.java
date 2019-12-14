
package com.uhc.optum.claims.institutionalclaimhistory.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.optum.apiengine.Errors;
import com.optum.apiengine.Result;
import com.optum.apiengine.StatusMessageLevel;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uhc.optum.claims.institutionalclaimhistory.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Errors_QNAME = new QName("http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", "errors");
    private final static QName _StatusMessageLevel_QNAME = new QName("http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", "statusMessageLevel");
    private final static QName _Result_QNAME = new QName("http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uhc.optum.claims.institutionalclaimhistory.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimAdjustmentType }
     * 
     */
    public ClaimAdjustmentType createClaimAdjustmentType() {
        return new ClaimAdjustmentType();
    }

    /**
     * Create an instance of {@link MnemonicType }
     * 
     */
    public MnemonicType createMnemonicType() {
        return new MnemonicType();
    }

    /**
     * Create an instance of {@link ServiceLineType }
     * 
     */
    public ServiceLineType createServiceLineType() {
        return new ServiceLineType();
    }

    /**
     * Create an instance of {@link NotesType }
     * 
     */
    public NotesType createNotesType() {
        return new NotesType();
    }

    /**
     * Create an instance of {@link ProviderResponseType }
     * 
     */
    public ProviderResponseType createProviderResponseType() {
        return new ProviderResponseType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link ProcedureCodeType }
     * 
     */
    public ProcedureCodeType createProcedureCodeType() {
        return new ProcedureCodeType();
    }

    /**
     * Create an instance of {@link ClaimEventType }
     * 
     */
    public ClaimEventType createClaimEventType() {
        return new ClaimEventType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link CodeDescPairType }
     * 
     */
    public CodeDescPairType createCodeDescPairType() {
        return new CodeDescPairType();
    }

    /**
     * Create an instance of {@link AccumType }
     * 
     */
    public AccumType createAccumType() {
        return new AccumType();
    }

    /**
     * Create an instance of {@link RequestSortingType }
     * 
     */
    public RequestSortingType createRequestSortingType() {
        return new RequestSortingType();
    }

    /**
     * Create an instance of {@link ServiceLineUHCTotalsType }
     * 
     */
    public ServiceLineUHCTotalsType createServiceLineUHCTotalsType() {
        return new ServiceLineUHCTotalsType();
    }

    /**
     * Create an instance of {@link SubscriberNameType }
     * 
     */
    public SubscriberNameType createSubscriberNameType() {
        return new SubscriberNameType();
    }

    /**
     * Create an instance of {@link ProviderNameType }
     * 
     */
    public ProviderNameType createProviderNameType() {
        return new ProviderNameType();
    }

    /**
     * Create an instance of {@link BenefitPlanType }
     * 
     */
    public BenefitPlanType createBenefitPlanType() {
        return new BenefitPlanType();
    }

    /**
     * Create an instance of {@link InstitutionalClaimHistoryRequest }
     * 
     */
    public InstitutionalClaimHistoryRequest createInstitutionalClaimHistoryRequest() {
        return new InstitutionalClaimHistoryRequest();
    }

    /**
     * Create an instance of {@link InstitutionalClaimHistoryResponse }
     * 
     */
    public InstitutionalClaimHistoryResponse createInstitutionalClaimHistoryResponse() {
        return new InstitutionalClaimHistoryResponse();
    }

    /**
     * Create an instance of {@link RequestPaginationType }
     * 
     */
    public RequestPaginationType createRequestPaginationType() {
        return new RequestPaginationType();
    }

    /**
     * Create an instance of {@link OccurenceCodeType }
     * 
     */
    public OccurenceCodeType createOccurenceCodeType() {
        return new OccurenceCodeType();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link BenefitClaimAccumType }
     * 
     */
    public BenefitClaimAccumType createBenefitClaimAccumType() {
        return new BenefitClaimAccumType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ClaimDocumentType }
     * 
     */
    public ClaimDocumentType createClaimDocumentType() {
        return new ClaimDocumentType();
    }

    /**
     * Create an instance of {@link CARCType }
     * 
     */
    public CARCType createCARCType() {
        return new CARCType();
    }

    /**
     * Create an instance of {@link InstitutionalClaimType }
     * 
     */
    public InstitutionalClaimType createInstitutionalClaimType() {
        return new InstitutionalClaimType();
    }

    /**
     * Create an instance of {@link AdjudicatedClaimPaymentType }
     * 
     */
    public AdjudicatedClaimPaymentType createAdjudicatedClaimPaymentType() {
        return new AdjudicatedClaimPaymentType();
    }

    /**
     * Create an instance of {@link SubscriberType }
     * 
     */
    public SubscriberType createSubscriberType() {
        return new SubscriberType();
    }

    /**
     * Create an instance of {@link ServiceLineOtherPayerType }
     * 
     */
    public ServiceLineOtherPayerType createServiceLineOtherPayerType() {
        return new ServiceLineOtherPayerType();
    }

    /**
     * Create an instance of {@link DiagnosisCodeType }
     * 
     */
    public DiagnosisCodeType createDiagnosisCodeType() {
        return new DiagnosisCodeType();
    }

    /**
     * Create an instance of {@link ResponsePaginationType }
     * 
     */
    public ResponsePaginationType createResponsePaginationType() {
        return new ResponsePaginationType();
    }

    /**
     * Create an instance of {@link OtherIdentifierSourceType }
     * 
     */
    public OtherIdentifierSourceType createOtherIdentifierSourceType() {
        return new OtherIdentifierSourceType();
    }

    /**
     * Create an instance of {@link OtherPayerType }
     * 
     */
    public OtherPayerType createOtherPayerType() {
        return new OtherPayerType();
    }

    /**
     * Create an instance of {@link UHCTotalsType }
     * 
     */
    public UHCTotalsType createUHCTotalsType() {
        return new UHCTotalsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", name = "errors")
    public JAXBElement<Errors> createErrors(Errors value) {
        return new JAXBElement<Errors>(_Errors_QNAME, Errors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMessageLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", name = "statusMessageLevel")
    public JAXBElement<StatusMessageLevel> createStatusMessageLevel(StatusMessageLevel value) {
        return new JAXBElement<StatusMessageLevel>(_StatusMessageLevel_QNAME, StatusMessageLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://optum.uhc.com/claims/institutionalclaimhistory/v1.0", name = "result")
    public JAXBElement<Result> createResult(Result value) {
        return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
    }

}
