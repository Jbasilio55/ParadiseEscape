import axios from "axios";

export const api = axios.create({
  baseURL: "http//localhost:9192",
});

//This function adds a new room to the database
export async function addRoom(photo, roomType, roomPrice) {
  const formData = new FormData();
  formData.append("photo", photo);
  formData.append("roomType", roomType);
  formData.append("roomPrice", roomPrice);

  const response = await api.post("/rooms/add/new-room", formData);

  if (response == true) {
    return true;
  } else {
    return false;
  }
}

// This function gets all room types from the database
export async function getRoomTypes() {
  try {
    const response = await api.get("/rooms/room-type");
    return response.data;
  } catch (error) {
    throw new Error("Error fetching room types.");
  }
}