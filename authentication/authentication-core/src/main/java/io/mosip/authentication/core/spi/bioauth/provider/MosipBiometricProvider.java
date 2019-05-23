package io.mosip.authentication.core.spi.bioauth.provider;

import java.util.Map;

/**
 * The Interface MosipBiometricProvider.
 *
 * @author Dinesh Karuppiah.T, Arun Bose S
 */

public interface MosipBiometricProvider {

	/**
	 * Score calculator for Minutiae.
	 *
	 * @param inputMinutiae the input minutiae
	 * @param storedMinutiae the stored minutiae
	 * @return the double
	 */
	double matchScoreCalculator(String inputMinutiae, String storedMinutiae);

	/**
	 * Score calculator for ISO Template.
	 *
	 * @param inputIsoTemplate the input iso template
	 * @param storedIsoTemplate the stored iso template
	 * @return the double
	 */
	double matchScoreCalculator(byte[] inputIsoTemplate, byte[] storedIsoTemplate);

	/**
	 * Method to Create Minutiae.
	 *
	 * @param inputImage the input image
	 * @return the string
	 */
	default String createMinutiae(byte[] inputImage) {
		return null;
	}
	
	
	/**
	 * Match image.
	 *
	 * @param reqInfo the req info
	 * @param entityInfo the entity info
	 * @return the double
	 */
	double matchImage(Object reqInfo,Object entityInfo);
	
	/**
	 * Match minutiae.
	 *
	 * @param reqInfo the req info
	 * @param entityInfo the entity info
	 * @return the double
	 */
	default double matchMinutiae(Object reqInfo,Object entityInfo){
		return 0;
	}
	
	/**
	 * Match multi minutae.
	 *
	 * @param reqInfo the req info
	 * @param entityInfo the entity info
	 * @return the double
	 */
	default double matchMultiMinutae( Map<String, String> reqInfo, Map<String, String> entityInfo) {
		return 0;
	}
	
	
	/**
	 * Match multi minutae.
	 *
	 * @param reqInfo the req info
	 * @param entityInfo the entity info
	 * @return the double
	 */
	default double matchMultiMinutaeAverage( Map<String, String> reqInfo, Map<String, String> entityInfo) {
		return 0;
	}
	
	/**
	 * Match multi image.
	 *
	 * @param reqInfo the req info
	 * @param entityInfo the entity info
	 * @return the double
	 */
	default double matchMultiImage( Object reqInfo, Object entityInfo){
		return 0;
	}

}
