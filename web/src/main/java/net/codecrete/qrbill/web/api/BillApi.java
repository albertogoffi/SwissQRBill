/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package net.codecrete.qrbill.web.api;

import net.codecrete.qrbill.web.model.QrBill;
import net.codecrete.qrbill.web.model.QrCodeInformation;
import org.springframework.core.io.Resource;
import net.codecrete.qrbill.web.model.ValidationMessage;
import net.codecrete.qrbill.web.model.ValidationResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-13T19:12:09.319311+02:00[Europe/Zurich]")

@Validated
@Api(value = "bill", description = "the bill API")
public interface BillApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Decode the text embedded in the QR code", nickname = "decodeQRCode", notes = "", response = ValidationResponse.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Validation result (incl. bill data)", response = ValidationResponse.class) })
    @RequestMapping(value = "/bill/decode",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ValidationResponse> decodeQRCode(@ApiParam(value = "QR code information" ,required=true )  @Valid @RequestBody QrCodeInformation qrCodeInformation) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"valid\" : true,  \"validationMessages\" : [ {    \"messageKey\" : \"messageKey\",    \"messageParameters\" : [ \"messageParameters\", \"messageParameters\" ],    \"field\" : \"field\",    \"type\" : \"Error\",    \"message\" : \"message\"  }, {    \"messageKey\" : \"messageKey\",    \"messageParameters\" : [ \"messageParameters\", \"messageParameters\" ],    \"field\" : \"field\",    \"type\" : \"Error\",    \"message\" : \"message\"  } ],  \"billID\" : \"billID\",  \"qrCodeText\" : \"qrCodeText\",  \"validatedBill\" : {    \"amount\" : 80082819.05449950695037841796875,    \"referenceNo\" : \"referenceNo\",    \"debtor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"dueDate\" : \"2000-01-23\",    \"finalCreditor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"additionalInfo\" : \"additionalInfo\",    \"language\" : \"de\",    \"currency\" : \"CHF\",    \"creditor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"version\" : \"V1_0\",    \"account\" : \"account\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Generates QR bill as PDF", nickname = "generateBillAsPDF", notes = "", response = Resource.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "QR bill as PDF", response = Resource.class),
        @ApiResponse(code = 422, message = "Validation error", response = ValidationMessage.class, responseContainer = "List") })
    @RequestMapping(value = "/bill/pdf/{outputSize}",
        produces = { "application/pdf", "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Resource> generateBillAsPDF(@ApiParam(value = "The output size of the generated QR bill (or QR code)",required=true, allowableValues = "\"a6-landscape\", \"a5-landscape\", \"a4-portrait\", \"qr-code-only\"") @PathVariable("outputSize") String outputSize,@ApiParam(value = "Bill data" ,required=true )  @Valid @RequestBody QrBill qrBill) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Generates QR bill as SVG", nickname = "generateBillAsSVG", notes = "", response = Resource.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "QR bill as SVG", response = Resource.class),
        @ApiResponse(code = 422, message = "Validation error", response = ValidationMessage.class, responseContainer = "List") })
    @RequestMapping(value = "/bill/svg/{outputSize}",
        produces = { "image/svg+xml", "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Resource> generateBillAsSVG(@ApiParam(value = "The output size of the generated QR bill (or QR code)",required=true, allowableValues = "\"a6-landscape\", \"a5-landscape\", \"a4-portrait\", \"qr-code-only\"") @PathVariable("outputSize") String outputSize,@ApiParam(value = "Bill data" ,required=true )  @Valid @RequestBody QrBill qrBill) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Generates QR bill as PDF", nickname = "getBillAsPDF", notes = "", response = Resource.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "QR bill as SVG", response = Resource.class),
        @ApiResponse(code = 422, message = "Validation error", response = ValidationMessage.class, responseContainer = "List") })
    @RequestMapping(value = "/bill/pdf/{outputSize}/{billID}",
        produces = { "application/pdf", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Resource> getBillAsPDF(@ApiParam(value = "The output size of the generated QR bill (or QR code)",required=true, allowableValues = "\"a6-landscape\", \"a5-landscape\", \"a4-portrait\", \"qr-code-only\"") @PathVariable("outputSize") String outputSize,@ApiParam(value = "Bill ID as returned by the validation response. Specifies the QR bill data uniquely.",required=true) @PathVariable("billID") String billID) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Generates QR bill as SVG", nickname = "getBillAsSVG", notes = "", response = Resource.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "QR bill as SVG", response = Resource.class),
        @ApiResponse(code = 422, message = "Validation error", response = ValidationMessage.class, responseContainer = "List") })
    @RequestMapping(value = "/bill/svg/{outputSize}/{billID}",
        produces = { "image/svg+xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Resource> getBillAsSVG(@ApiParam(value = "The output size of the generated QR bill (or QR code)",required=true, allowableValues = "\"a6-landscape\", \"a5-landscape\", \"a4-portrait\", \"qr-code-only\"") @PathVariable("outputSize") String outputSize,@ApiParam(value = "Bill ID as returned by the validation response. Specifies the QR bill data uniquely.",required=true) @PathVariable("billID") String billID) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Validate the data for a QR bill", nickname = "validateBill", notes = "Validates the data for a QR bill. The result contains a list of errors (if any), a bill ID (if the data is valid) and the possibly modified bill data.", response = ValidationResponse.class, tags={ "bills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Validation result", response = ValidationResponse.class) })
    @RequestMapping(value = "/bill/validate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ValidationResponse> validateBill(@ApiParam(value = "Bill data to be validated" ,required=true )  @Valid @RequestBody QrBill qrBill) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"valid\" : true,  \"validationMessages\" : [ {    \"messageKey\" : \"messageKey\",    \"messageParameters\" : [ \"messageParameters\", \"messageParameters\" ],    \"field\" : \"field\",    \"type\" : \"Error\",    \"message\" : \"message\"  }, {    \"messageKey\" : \"messageKey\",    \"messageParameters\" : [ \"messageParameters\", \"messageParameters\" ],    \"field\" : \"field\",    \"type\" : \"Error\",    \"message\" : \"message\"  } ],  \"billID\" : \"billID\",  \"qrCodeText\" : \"qrCodeText\",  \"validatedBill\" : {    \"amount\" : 80082819.05449950695037841796875,    \"referenceNo\" : \"referenceNo\",    \"debtor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"dueDate\" : \"2000-01-23\",    \"finalCreditor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"additionalInfo\" : \"additionalInfo\",    \"language\" : \"de\",    \"currency\" : \"CHF\",    \"creditor\" : {      \"town\" : \"town\",      \"street\" : \"street\",      \"countryCode\" : \"countryCode\",      \"postalCode\" : \"postalCode\",      \"name\" : \"name\",      \"houseNo\" : \"houseNo\"    },    \"version\" : \"V1_0\",    \"account\" : \"account\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
