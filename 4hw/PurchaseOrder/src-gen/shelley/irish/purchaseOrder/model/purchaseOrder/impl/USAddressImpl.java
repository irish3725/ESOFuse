/**
 */
package shelley.irish.purchaseOrder.model.purchaseOrder.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shelley.irish.purchaseOrder.model.purchaseOrder.PurchaseOrderPackage;
import shelley.irish.purchaseOrder.model.purchaseOrder.USAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getState <em>State</em>}</li>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link shelley.irish.purchaseOrder.model.purchaseOrder.impl.USAddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class USAddressImpl extends MinimalEObjectImpl.Container implements USAddress {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final int ZIP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected int zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = "\"US\"";

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PurchaseOrderPackage.Literals.US_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__STREET, oldStreet,
					street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__CITY, oldCity,
					city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip(int newZip) {
		int oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PurchaseOrderPackage.US_ADDRESS__COUNTRY, oldCountry,
					country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PurchaseOrderPackage.US_ADDRESS__NAME:
			return getName();
		case PurchaseOrderPackage.US_ADDRESS__STREET:
			return getStreet();
		case PurchaseOrderPackage.US_ADDRESS__CITY:
			return getCity();
		case PurchaseOrderPackage.US_ADDRESS__STATE:
			return getState();
		case PurchaseOrderPackage.US_ADDRESS__ZIP:
			return getZip();
		case PurchaseOrderPackage.US_ADDRESS__COUNTRY:
			return getCountry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PurchaseOrderPackage.US_ADDRESS__NAME:
			setName((String) newValue);
			return;
		case PurchaseOrderPackage.US_ADDRESS__STREET:
			setStreet((String) newValue);
			return;
		case PurchaseOrderPackage.US_ADDRESS__CITY:
			setCity((String) newValue);
			return;
		case PurchaseOrderPackage.US_ADDRESS__STATE:
			setState((String) newValue);
			return;
		case PurchaseOrderPackage.US_ADDRESS__ZIP:
			setZip((Integer) newValue);
			return;
		case PurchaseOrderPackage.US_ADDRESS__COUNTRY:
			setCountry((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PurchaseOrderPackage.US_ADDRESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PurchaseOrderPackage.US_ADDRESS__STREET:
			setStreet(STREET_EDEFAULT);
			return;
		case PurchaseOrderPackage.US_ADDRESS__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case PurchaseOrderPackage.US_ADDRESS__STATE:
			setState(STATE_EDEFAULT);
			return;
		case PurchaseOrderPackage.US_ADDRESS__ZIP:
			setZip(ZIP_EDEFAULT);
			return;
		case PurchaseOrderPackage.US_ADDRESS__COUNTRY:
			setCountry(COUNTRY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PurchaseOrderPackage.US_ADDRESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PurchaseOrderPackage.US_ADDRESS__STREET:
			return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
		case PurchaseOrderPackage.US_ADDRESS__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case PurchaseOrderPackage.US_ADDRESS__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case PurchaseOrderPackage.US_ADDRESS__ZIP:
			return zip != ZIP_EDEFAULT;
		case PurchaseOrderPackage.US_ADDRESS__COUNTRY:
			return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", street: ");
		result.append(street);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", zip: ");
		result.append(zip);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //USAddressImpl
